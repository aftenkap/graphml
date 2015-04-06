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



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * Complex type for the {@code <node>} element.
 * 
 * 
 * <p>
 * Java class for node.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="node.type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}description" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *               &lt;element ref="{http://graphml.graphdrawing.org/xmlns}data"/&gt;
 *               &lt;element ref="{http://graphml.graphdrawing.org/xmlns}port"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element ref="{http://graphml.graphdrawing.org/xmlns}graph" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element ref="{http://graphml.graphdrawing.org/xmlns}locator"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}node.extra.attrib"/&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "node.type", propOrder = { "description", "keyData", "ports",
        "graph", "locator" })
public class Node
        implements IKeyDataContainer {

    @XmlElement(name = "desc")
    private String        description;

    @XmlElement(name = "data")
    private List<KeyData> keyData;

    @XmlElement(name = "port")
    private List<Port>    ports;

    @XmlElement(name = "graph")
    private Graph         graph;

    @XmlElement(name = "locator")
    private Locator       locator;

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String        id;

    @XmlAttribute(name = "parse.indegree")
    private BigInteger    incomingDegree;

    @XmlAttribute(name = "parse.outdegree")
    private BigInteger    outgoingDegree;

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDescription() {

        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDescription(String value) {

        this.description = value;
    }

    /**
     * Gets the value of the keyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the keyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getKeyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link KeyData }
     * 
     * 
     */
    @Override
    public List<KeyData> getKeyData() {

        if (keyData == null) {
            keyData = new ArrayList<KeyData>();
        }
        return this.keyData;
    }


    /**
     * Gets the value of the ports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the ports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPorts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Port }
     * 
     * @return a {@link List} of {@link Port Ports}.
     */
    public List<Port> getPorts() {

        if (ports == null) {
            ports = new ArrayList<Port>();
        }
        return this.ports;
    }

    /**
     * Gets the value of the graph property.
     * 
     * @return possible object is {@link Graph }
     * 
     */
    public Graph getGraph() {

        return graph;
    }

    /**
     * Sets the value of the graph property.
     * 
     * @param value
     *            allowed object is {@link Graph }
     * 
     */
    public void setGraph(Graph value) {

        this.graph = value;
    }

    /**
     * Gets the value of the locator property.
     * 
     * @return possible object is {@link Locator }
     * 
     */
    public Locator getLocator() {

        return locator;
    }

    /**
     * Sets the value of the locator property.
     * 
     * @param value
     *            allowed object is {@link Locator }
     * 
     */
    public void setLocator(Locator value) {

        this.locator = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {

        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setId(String value) {

        this.id = value;
    }

    /**
     * Gets the value of the incomingDegree property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getIncomingDegree() {

        return incomingDegree;
    }

    /**
     * Sets the value of the incomingDegree property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setIncomingDegree(BigInteger value) {

        this.incomingDegree = value;
    }

    /**
     * Gets the value of the outgoingDegree property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getOutgoingDegree() {

        return outgoingDegree;
    }

    /**
     * Sets the value of the outgoingDegree property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setOutgoingDegree(BigInteger value) {

        this.outgoingDegree = value;
    }

}
