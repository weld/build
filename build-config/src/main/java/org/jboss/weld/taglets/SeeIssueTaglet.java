/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.taglets;

import java.text.MessageFormat;
import java.util.Map;

import com.sun.javadoc.Tag;
import com.sun.tools.doclets.Taglet;
/**
 * @author Kirill Gaevskii
 *
 */
public class SeeIssueTaglet implements Taglet {

    private static final String NAME = "seeIssue";
    private static final String HEADER = "<span class=\"seeLabel\">Issue tracker:</span><br>\n";
    private static final String BUGZILLALINK = "<a href=\"https://bugzilla.redhat.com/show_bug.cgi?id={0}\">{1}</a>";
    private static final String JIRALINK = "<a href=\"https://issues.jboss.org/browse/{0}\">{1}</a>";

    public static final SeeIssueTaglet INSTANCE = new SeeIssueTaglet();

    private SeeIssueTaglet() {}

    /**
     * Returns the name of this taglet.
     *
     * @return the name of this taglet.
     */
    @Override
    public String getName() {
        return NAME;
    }

    /**
     * Return true if this taglet applicable in constructor documentation.
     *
     * @return is this taglet applicable in constructor documentation.
     */
    @Override
    public boolean inConstructor() {
        return true;
    }

    /**
     * Return true if this taglet applicable in field documentation.
     *
     * @return is this taglet applicable in field documentation.
     */
    @Override
    public boolean inField() {
        return true;
    }

    /**
     * Return true if this taglet applicable in method documentation.
     *
     * @return is this taglet applicable in method documentation.
     */
    @Override
    public boolean inMethod() {
        return true;
    }

    /**
     * Return true if this taglet applicable in overview documentation.
     *
     * @return is this taglet applicable in overview documentation.
     */
    @Override
    public boolean inOverview() {
        return true;
    }

    /**
     * Return true if this taglet applicable in package documentation.
     *
     * @return is this taglet applicable in package documentation.
     */
    @Override
    public boolean inPackage() {
        return true;
    }

    /**
     * Return true if this taglet applicable in type documentation.
     *
     * @return is this taglet applicable in type documentation.
     */
    @Override
    public boolean inType() {
        return true;
    }

    /**
     * Return true if this taglet is an inline tag.
     *
     * @return is this taglet is an inline tag.
     */
    @Override
    public boolean isInlineTag() {
        return false;
    }

    /**
     * Register this Taglet.
     *
     * @param tagletMap  the map to register this tag to.
     */
    public static void register(Map<String, Taglet> tagletMap) {
       tagletMap.put(SeeIssueTaglet.INSTANCE.getName(), SeeIssueTaglet.INSTANCE);
    }

    /**
     * Given the tag representation of this custom tag, return its string representation, which is output to the generated page.
     *
     * @param tag - the Tag representation of this custom tag.
     *
     * @return the string representation of this tag.
     */
    @Override
    public String toString(Tag tag) {
        return  HEADER
                + makeLink(tag.text())
                + "<br>\n";
    }

    private static String makeLink(String name) {
        if (name.startsWith("BZ") && name.length() > 2) {
            return MessageFormat.format(BUGZILLALINK, name.substring(2), name);
        } else {
            return MessageFormat.format(JIRALINK, name, name);
        }
    }

    /**
     * Given an array of tags representing this custom tag, return its string representation, which is output to the generated page.
     *
     * @param tags - the array of tags representing of this custom tag.
     *
     * @return the string representation of this tag.
     */
    @Override
    public String toString(Tag[] tags) {
        if (tags.length == 0) {
            return null;
        }
        StringBuilder result = new StringBuilder(HEADER);

        result.append("<ul>\n");
        for (int i = 0; i < tags.length; i++) {
            result.append("<li>");
            result.append(makeLink(tags[i].text()));
            result.append("</li>\n");
        }
        result.append("</ul>\n");

        return result.toString();
    }

}
