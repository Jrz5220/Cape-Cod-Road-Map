# Cape-Cod-Road-Map
A java implementation of a weighted graph with directed edges to traverse a map of Cape Cod.<br/>
Implementation includes traversal methods and searching capabilities.
<br/>
<br/>
A graph data structure is a collection of vertices (nodes) and edges, where the vertices are connected to each other through edges.
The purpose of a graph is to focus on the connections between the vertices, rather than the vertices contents.
<br/>
<br/>
In this application, we focus on the travel distance between each city in Cape Cod. The cities are represented as vertices and the streets connecting each city are the edges.<br/>
Each edge in the graph holds a weight that represents the miles between each city.<br/>
BasicGraphInterface provides methods for performing basic graph operations, such as adding vertices and edges.<br/>
GraphAlgorithmsInterface provides methods to perform breadth-first and depth-first traversals, sort vertices in topological order, and search for the shortest and cheapest path between two vertices.<br/>
GraphInterface extends the first two interfaces. The DirectedGraph class implements this interface to inherit the methods of both BasicGraphInterface and GraphAlgorithmsInterface.<br/>
The map of Cape Cod is constructed in the Driver class.<br/>
