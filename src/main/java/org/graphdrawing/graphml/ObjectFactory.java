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



import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.graphdrawing.graphml.xmlns package.
 * <p>
 * An ObjectFactory allows you to programmatically construct new instances of
 * the Java representation for XML content. The Java representation of XML
 * content can consist of schema derived interfaces and classes representing the
 * binding of schema type definitions, element declarations and model groups.
 * Factory methods for each of these are provided in this class.
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Data_QNAME      = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "data");
    private final static QName _Key_QNAME       = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "key");
    private final static QName _Endpoint_QNAME  = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "endpoint");
    private final static QName _Graphml_QNAME   = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "graphml");
    private final static QName _Node_QNAME      = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "node");
    private final static QName _Desc_QNAME      = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "desc");
    private final static QName _Default_QNAME   = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "default");
    private final static QName _Graph_QNAME     = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "graph");
    private final static QName _Edge_QNAME      = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "edge");
    private final static QName _Port_QNAME      = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "port");
    private final static QName _Locator_QNAME   = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "locator");
    private final static QName _Hyperedge_QNAME = new QName(
                                                        "http://graphml.graphdrawing.org/xmlns",
                                                        "hyperedge");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: org.graphdrawing.graphml.xmlns
     * 
     */
    public ObjectFactory() {

    }

    /**
     * Create an instance of {@link Port }.
     * 
     * @return an instance of {@link Port }.
     * 
     */
    public Port createPortType() {

        return new Port();
    }

    /**
     * Create an instance of {@link Locator }.
     * 
     * @return an instance of {@link Locator }.
     * 
     */
    public Locator createLocatorType() {

        return new Locator();
    }

    /**
     * Create an instance of {@link Node }.
     * 
     * @return an instance of {@link Node }.
     * 
     */
    public Node createNodeType() {

        return new Node();
    }

    /**
     * Create an instance of {@link Edge }.
     * 
     * @return an instance of {@link Edge }.
     * 
     */
    public Edge createEdgeType() {

        return new Edge();
    }

    /**
     * Create an instance of {@link Graph }.
     * 
     * @return an instance of {@link Graph }.
     * 
     */
    public Graph createGraphType() {

        return new Graph();
    }

    /**
     * Create an instance of {@link DefaultKeyValue }.
     * 
     * @return an instance of {@link DefaultKeyValue }.
     * 
     */
    public DefaultKeyValue createDefaultType() {

        return new DefaultKeyValue();
    }

    /**
     * Create an instance of {@link Hyperedge }.
     * 
     * @return an instance of {@link Hyperedge }.
     * 
     */
    public Hyperedge createHyperedgeType() {

        return new Hyperedge();
    }

    /**
     * Create an instance of {@link KeyData }.
     * 
     * @return an instance of {@link KeyData }.
     * 
     */
    public KeyData createDataType() {

        return new KeyData();
    }

    /**
     * Create an instance of {@link GraphMLDocument }.
     * 
     * @return an instance of {@link GraphMLDocument }.
     * 
     */
    public GraphMLDocument createGraphmlType() {

        return new GraphMLDocument();
    }

    /**
     * Create an instance of {@link Endpoint }.
     * 
     * @return an instance of {@link Endpoint }.
     * 
     */
    public Endpoint createEndpointType() {

        return new Endpoint();
    }

    /**
     * Create an instance of {@link Key }.
     * 
     * @return an instance of {@link Key }.
     * 
     */
    public Key createKeyType() {

        return new Key();
    }

    /**
     * Create an instance of {@link KeyDataExtension }.
     * 
     * @return an instance of {@link KeyDataExtension }.
     * 
     */
    public KeyDataExtension createDataExtensionType() {

        return new KeyDataExtension();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyData }{@code >}
     * from the provided value.
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}{@link KeyData }
     *         {@code >} from the provided value.
     * 
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "data")
    public JAXBElement<KeyData> createData(KeyData value) {

        return new JAXBElement<KeyData>(_Data_QNAME, KeyData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Key }{@code >}
     * from the provided value.
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}{@link Key } {@code >}
     *         from the provided value.
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "key")
    public JAXBElement<Key> createKey(Key value) {

        return new JAXBElement<Key>(_Key_QNAME, Key.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endpoint } from
     * the provided value. {@code >}
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}{@link Endpoint }
     *         {@code >} from the provided value.
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "endpoint")
    public JAXBElement<Endpoint> createEndpoint(Endpoint value) {

        return new JAXBElement<Endpoint>(_Endpoint_QNAME, Endpoint.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphMLDocument }
     * from the provided value. {@code >}
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}
     *         {@link GraphMLDocument } {@code >} from the provided value.
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "graphml")
    public JAXBElement<GraphMLDocument> createGraphml(GraphMLDocument value) {

        return new JAXBElement<GraphMLDocument>(_Graphml_QNAME,
                GraphMLDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Node }{@code >}
     * from the provided value.
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}{@link Node } {@code >}
     *         from the provided value.
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "node")
    public JAXBElement<Node> createNode(Node value) {

        return new JAXBElement<Node>(_Node_QNAME, Node.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * from the provided value.
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}{@link String }
     *         {@code >} from the provided value.
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "desc")
    public JAXBElement<String> createDesc(String value) {

        return new JAXBElement<String>(_Desc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefaultKeyValue }
     * from the provided value. {@code >}
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}
     *         {@link DefaultKeyValue } {@code >} from the provided value.
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "default")
    public JAXBElement<DefaultKeyValue> createDefault(DefaultKeyValue value) {

        return new JAXBElement<DefaultKeyValue>(_Default_QNAME,
                DefaultKeyValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Graph }{@code >}
     * from the provided value.
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}{@link Graph }
     *         {@code >} from the provided value.
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "graph")
    public JAXBElement<Graph> createGraph(Graph value) {

        return new JAXBElement<Graph>(_Graph_QNAME, Graph.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edge }{@code >}
     * from the provided value.
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}{@link Edge } {@code >}
     *         from the provided value.
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "edge")
    public JAXBElement<Edge> createEdge(Edge value) {

        return new JAXBElement<Edge>(_Edge_QNAME, Edge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Port }{@code >}
     * from the provided value.
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}{@link Port } {@code >}
     *         from the provided value.
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "port")
    public JAXBElement<Port> createPort(Port value) {

        return new JAXBElement<Port>(_Port_QNAME, Port.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Locator }{@code >}
     * from the provided value.
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}{@link Locator }
     *         {@code >} from the provided value.
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "locator")
    public JAXBElement<Locator> createLocator(Locator value) {

        return new JAXBElement<Locator>(_Locator_QNAME, Locator.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hyperedge } from
     * the provided value. {@code >}
     * 
     * @param value
     *            the value
     * @return an instance of {@link JAXBElement }{@code <}{@link Hyperedge }
     *         {@code >} from the provided value.
     */
    @XmlElementDecl(namespace = "http://graphml.graphdrawing.org/xmlns",
            name = "hyperedge")
    public JAXBElement<Hyperedge> createHyperedge(Hyperedge value) {

        return new JAXBElement<Hyperedge>(_Hyperedge_QNAME, Hyperedge.class,
                null, value);
    }

}
