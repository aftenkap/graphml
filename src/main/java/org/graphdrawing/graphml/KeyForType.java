package org.graphdrawing.graphml;

//@formatter:off
/*
* #%L
 * * GraphML library
 * *
 * %%
 * Copyright (C) 2011 - 2014 jutility.org
 * *
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
//@formatter:on



import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for key.for.type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;simpleType name="key.for.type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="graphml"/&gt;
 *     &lt;enumeration value="graph"/&gt;
 *     &lt;enumeration value="node"/&gt;
 *     &lt;enumeration value="edge"/&gt;
 *     &lt;enumeration value="hyperedge"/&gt;
 *     &lt;enumeration value="port"/&gt;
 *     &lt;enumeration value="endpoint"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlType(name = "key.for.type")
@XmlEnum
public enum KeyForType {

    /**
     * Key for all types of elements.
     */
    @XmlEnumValue("all")
    ALL("all"),
    /**
     * Key for the GraphML document
     */
    @XmlEnumValue("graphml")
    GRAPHML("graphml"),
    /**
     * Key for graphs.
     */
    @XmlEnumValue("graph")
    GRAPH("graph"),
    /**
     * Key for nodes.
     */
    @XmlEnumValue("node")
    NODE("node"),
    /**
     * Key for edges.
     */
    @XmlEnumValue("edge")
    EDGE("edge"),
    /**
     * Key for hyperedges.
     */
    @XmlEnumValue("hyperedge")
    HYPEREDGE("hyperedge"),
    /**
     * Key for ports.
     */
    @XmlEnumValue("port")
    PORT("port"),
    /**
     * Key for endpoints.
     */
    @XmlEnumValue("endpoint")
    ENDPOINT("endpoint");

    private final String value;

    /**
     * Creates a new instance of the {@link KeyForType} class with the provided
     * value.
     * 
     * @param value
     *            the value.
     */
    private KeyForType(String value) {

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
     * Returns the {@link KeyForType} corresponding to the provided value.
     * 
     * @param value
     *            the value.
     * @return the {@link KeyForType} corresponding to the provided value.
     */
    public static KeyForType fromValue(String value) {

        for (KeyForType constant : KeyForType.values()) {

            if (constant.value.equals(value)) {

                return constant;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
