/*
Copyright 2016 Eddie N. <en@sector572.com>

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.sector572.utils.appinfo.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A simple class to hold application information including name, version, etc.
 *
 * @author Eddie N. <en@sector572.com>
 */
public class ApplicationInformation
{
    private String name;
    private String description;
    private int major;
    private int minor;
    private int patch;
    private List<String> labels;
    private String staticLabels;

    /**
     * Disabled default constructor.
     */
    private ApplicationInformation()
    {
    }

    /**
     * Initializes an instance of ApplicationInformation with the following
     * parameters.
     *
     * @param name
     * @param major
     * @param minor
     * @param patch
     */
    public ApplicationInformation(String name,
                                  int major,
                                  int minor,
                                  int patch)
    {
        this.name = name;
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }

    /**
     * Initializes an instance of ApplicationInformation with the following
     * parameters.
     *
     * @param name
     * @param description
     * @param major
     * @param minor
     * @param patch
     */
    public ApplicationInformation(String name,
                                  String description,
                                  int major,
                                  int minor,
                                  int patch)
    {
        this(name,
             major,
             minor,
             patch);

        this.description = description;
    }

    /**
     * Initializes an instance of ApplicationInformation with the following
     * parameters.
     *
     * @param name
     * @param major
     * @param minor
     * @param patch
     * @param labels
     */
    public ApplicationInformation(String name,
                                  int major,
                                  int minor,
                                  int patch,
                                  List<String> labels)
    {
        this(name,
             major,
             minor,
             patch);

        this.labels = new ArrayList<>();
        this.labels.addAll(labels);
        initStaticLabels();
    }

    /**
     * Initializes an instance of ApplicationInformation with the following
     * parameters.
     *
     * @param name
     * @param description
     * @param major
     * @param minor
     * @param patch
     * @param labels
     */
    public ApplicationInformation(String name,
                                  String description,
                                  int major,
                                  int minor,
                                  int patch,
                                  List<String> labels)
    {
        this(name,
             major,
             minor,
             patch,
             labels);

        this.description = description;
    }

    /**
     * Initializes static labels property.
     */
    private void initStaticLabels()
    {
        if (labels != null && !labels.isEmpty())
        {
            StringBuilder sb = new StringBuilder();

            for (String label : labels)
            {
                sb.append(label);
            }

            staticLabels = sb.toString();
        }
    }

    /**
     * Returns the application name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the application description.
     *
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Returns the application major version number.
     *
     * @return the major
     */
    public int getMajor()
    {
        return major;
    }

    /**
     * Returns the application minor version number.
     *
     * @return the minor
     */
    public int getMinor()
    {
        return minor;
    }

    /**
     * Returns the application patch version number.
     *
     * @return the patch
     */
    public int getPatch()
    {
        return patch;
    }

    /**
     * Returns an unmodifiable list of all additional labels that have been
     * specified at initialization time.
     *
     * @return the labels
     */
    public List<String> getLabels()
    {
        return Collections.unmodifiableList(labels);
    }

    /**
     * Returns the complete application version including the name, version
     * numbers, and any labels (if provided).
     *
     * @return
     */
    @Override
    public String toString()
    {
        return name + " v" + major + "." + minor + "." + patch + staticLabels;
    }
}
