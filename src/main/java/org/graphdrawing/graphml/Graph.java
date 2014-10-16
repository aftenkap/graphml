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



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * Complex type for the {code <graph>} element.
 * 
 * 
 * <p>
 * Java class for graph.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="graph.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}description" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *               &lt;element ref="{http://graphml.graphdrawing.org/xmlns}keyData"/>
 *               &lt;element ref="{http://graphml.graphdrawing.org/xmlns}node"/>
 *               &lt;element ref="{http://graphml.graphdrawing.org/xmlns}edge"/>
 *               &lt;element ref="{http://graphml.graphdrawing.org/xmlns}hyperedge"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;element ref="{http://graphml.graphdrawing.org/xmlns}locator"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}graph.extra.attrib"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="defaultEdgeType" use="required" type="{http://graphml.graphdrawing.org/xmlns}graph.defaultEdgeType.type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graph.type", propOrder = { "description", "keyData", "nodes",
        "edges", "hyperedges", "locator" })
public class Graph
        implements IKeyDataContainer {

    @XmlElement(name = "desc")
    private String          description;

    @XmlElement(name = "data")
    private List<KeyData>   keyData;

    @XmlElement(name = "node")
    private List<Node>      nodes;

    @XmlElement(name = "edge")
    private List<Edge>      edges;


    @XmlElement(name = "hyperedge")
    private List<Hyperedge> hyperedges;

    @XmlElement(name = "locator")
    private Locator         locator;

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String          id;

    @XmlAttribute(name = "edgedefault", required = true)
    private DefaultEdgeType defaultEdgeType;

    @XmlAttribute(name = "parse.nodeids")
    private NodeIDType      nodeIDType;

    @XmlAttribute(name = "parse.edgeids")
    private EdgeIDType      edgeIDType;

    @XmlAttribute(name = "parse.order")
    private GraphParseOrder graphParseOrder;

    @XmlAttribute(name = "parse.nodes")
    private BigInteger      numberOfNodes;

    @XmlAttribute(name = "parse.edges")
    private BigInteger      numberOfEdges;

    @XmlAttribute(name = "parse.maxindegree")
    private BigInteger      maximumIncomingDegree;

    @XmlAttribute(name = "parse.maxoutdegree")
    private BigInteger      maximumOutgoingDegree;

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
     */
    @Override
    public List<KeyData> getKeyData() {

        if (keyData == null) {
            keyData = new ArrayList<KeyData>();
        }
        return this.keyData;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the nodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Node }
     * 
     * @return a {@link List} of {@link Node Nodes}.
     */
    public List<Node> getNodes() {

        if (nodes == null) {

            nodes = new ArrayList<Node>();
        }
        return this.nodes;
    }

    /**
     * Gets the value of the edges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the edges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getEdges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Edge }
     * 
     * @return a {@link List} of {@link Edge Edges}.
     */
    public List<Edge> getEdges() {

        if (edges == null) {
            edges = new ArrayList<Edge>();
        }
        return this.edges;
    }

    /**
     * Gets the value of the hyperedges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the hyperedges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getHyperedges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link KeyData }
     * {@link Node } {@link Edge } {@link Hyperedge }
     * 
     * 
     * @return a {@link List} of {@link Hyperedge Hyperedges}.
     */
    public List<Hyperedge> getHyperedges() {

        if (hyperedges == null) {
            hyperedges = new ArrayList<Hyperedge>();
        }
        return this.hyperedges;
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
     * Gets the value of the defaultEdgeType property.
     * 
     * @return possible object is {@link DefaultEdgeType }
     * 
     */
    public DefaultEdgeType getDefaultEdgeType() {

        return defaultEdgeType;
    }

    /**
     * Sets the value of the defaultEdgeType property.
     * 
     * @param value
     *            allowed object is {@link DefaultEdgeType }
     * 
     */
    public void setDefaultEdgeType(DefaultEdgeType value) {

        this.defaultEdgeType = value;
    }

    /**
     * Gets the value of the nodeIDType property.
     * 
     * @return possible object is {@link NodeIDType }
     * 
     */
    public NodeIDType getNodeIDType() {

        return nodeIDType;
    }

    /**
     * Sets the value of the nodeIDType property.
     * 
     * @param value
     *            allowed object is {@link NodeIDType }
     * 
     */
    public void setNodeIDType(NodeIDType value) {

        this.nodeIDType = value;
    }

    /**
     * Gets the value of the edgeIDType property.
     * 
     * @return possible object is {@link EdgeIDType }
     * 
     */
    public EdgeIDType getEdgeIDType() {

        return edgeIDType;
    }

    /**
     * Sets the value of the edgeIDType property.
     * 
     * @param value
     *            allowed object is {@link EdgeIDType }
     * 
     */
    public void setEdgeIDType(EdgeIDType value) {

        this.edgeIDType = value;
    }

    /**
     * Gets the value of the graphParseOrder property.
     * 
     * @return possible object is {@link GraphParseOrder }
     * 
     */
    public GraphParseOrder getGraphParseOrder() {

        return graphParseOrder;
    }

    /**
     * Sets the value of the graphParseOrder property.
     * 
     * @param value
     *            allowed object is {@link GraphParseOrder }
     * 
     */
    public void setGraphParseOrder(GraphParseOrder value) {

        this.graphParseOrder = value;
    }

    /**
     * Gets the value of the numberOfNodes property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumberOfNodes() {

        return numberOfNodes;
    }

    /**
     * Sets the value of the numberOfNodes property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setNumberOfNodes(BigInteger value) {

        this.numberOfNodes = value;
    }

    /**
     * Gets the value of the numberOfEdges property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNumberOfEdges() {

        return numberOfEdges;
    }

    /**
     * Sets the value of the numberOfEdges property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setNumberOfEdges(BigInteger value) {

        this.numberOfEdges = value;
    }

    /**
     * Gets the value of the maximumIncomingDegree property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getMaximumIncomingDegree() {

        return maximumIncomingDegree;
    }

    /**
     * Sets the value of the maximumIncomingDegree property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setMaximumIncomingDegree(BigInteger value) {

        this.maximumIncomingDegree = value;
    }

    /**
     * Gets the value of the maximumOutgoingDegree property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getMaximumOutgoingDegree() {

        return maximumOutgoingDegree;
    }

    /**
     * Sets the value of the maximumOutgoingDegree property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setMaximumOutgoingDegree(BigInteger value) {

        this.maximumOutgoingDegree = value;
    }

}
