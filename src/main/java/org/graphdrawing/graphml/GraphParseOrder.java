package org.graphdrawing.graphml;

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



import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for graph.order.type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="graph.order.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="nodesfirst"/>
 *     &lt;enumeration value="adjacencylist"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlType(name = "graph.order.type")
@XmlEnum
public enum GraphParseOrder {

    /**
     * Free graph parse order.
     */
    @XmlEnumValue("free")
    FREE("free"),
    /**
     * Nodes should be parsed first.
     */
    @XmlEnumValue("nodesfirst")
    NODESFIRST("nodesfirst"),
    /**
     * Parser should parse based on adjacency list.
     */
    @XmlEnumValue("adjacencylist")
    ADJACENCYLIST("adjacencylist");

    private final String value;

    /**
     * Creates a new instance of the {@link GraphParseOrder} class with the
     * provided value.
     * 
     * @param value
     *            the value.
     */
    private GraphParseOrder(String value) {

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
     * Returns the {@link GraphParseOrder} corresponding to the provided value.
     * 
     * @param value
     *            the value.
     * @return the {@link GraphParseOrder} corresponding to the provided value.
     */
    public static GraphParseOrder fromValue(String value) {

        for (GraphParseOrder constant : GraphParseOrder.values()) {

            if (constant.value.equals(value)) {

                return constant;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
