#!/bin/sh

ANNOTATIONS="@PersistenceXml @WebXml @EjbJarXml"

report=`pwd`/dd-override-report.txt
echo "Deployment Descriptors overriden by the TCK\n\n" > dd-override-report.txt

if [[ -z $TCK_HOME ]]
then
   echo "ERROR: You must set the environment variable TCK_HOME to point at the TCK to report on"
   exit
fi

echo "Using TCK in $TCK_HOME"

cd $TCK_HOME/impl/src/main/java
for annotation in $ANNOTATIONS
do
  echo "$annotation\n" >> $report 
  echo "------------\n" >> $report
  grep -r "$annotation" --include "*.java" * | sed 's/[A-z]*\.java:@[A-z]*("//g' | sed 's/")//g' | sed 's///g' >> $report
  echo "\n" >> $report 
done
