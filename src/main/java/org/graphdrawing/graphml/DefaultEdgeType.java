package org.graphdrawing.graphml;


// @formatter:off
/*
 * #%L
 * GraphML library
 * %%
 * Copyright (C) 2011 - 2014 jutility.org
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
// @formatter:on


import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for graph.edgedefault.type.
 * </p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 * 
 * <pre>
 * &lt;simpleType name="graph.edgedefault.type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="directed"/&gt;
 *     &lt;enumeration value="undirected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlType(name = "graph.edgedefault.type")
@XmlEnum
public enum DefaultEdgeType {

    /**
     * Directed edge.
     */
    @XmlEnumValue("directed")
    DIRECTED("directed"),
    /**
     * Undirected edge.
     */
    @XmlEnumValue("undirected")
    UNDIRECTED("undirected");

    private final String value;

    /**
     * Creates a new instance of the {@link DefaultEdgeType} class.
     * 
     * @param value
     *            the value.
     */
    private DefaultEdgeType(String value) {

        this.value = value;
    }

    /**
     * Returns the value.
     * 
     * @return the value.
     */
    public String value() {

        return value;
    }

    /**
     * Returns the instance of the {@link DefaultEdgeType} corresponding to the
     * provided value.
     * 
     * @param value
     *            the value.
     * @return the instance of the {@link DefaultEdgeType} corresponding to the
     *         provided value.
     */
    public static DefaultEdgeType fromValue(String value) {

        for (DefaultEdgeType constant : DefaultEdgeType.values()) {

            if (constant.value().equals(value)) {

                return constant;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
