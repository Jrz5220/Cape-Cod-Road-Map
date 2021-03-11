
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Driver {

	public static void main(String[] args) {
		
	    DirectedGraph<String> capeCod = new DirectedGraph<>();
		
	    String provincetown = "Provincetown";
	    String hyannis = "Hyannis";
	    String truro = "Truro";
	    String orleans = "Orleans";
	    String chatham = "Chatham";
	    String barnstable = "Barnstable";
	    String sandwich = "Sandwich";
	    String falmouth = "Falmouth";
		
	    // add towns
	    capeCod.addVertex(provincetown);
	    capeCod.addVertex(truro);
	    capeCod.addVertex(orleans);
	    capeCod.addVertex(chatham);
	    capeCod.addVertex(hyannis);
	    capeCod.addVertex(barnstable);
	    capeCod.addVertex(sandwich);
	    capeCod.addVertex(falmouth);
	    
	    // connect towns
	    capeCod.addEdge(provincetown, truro, 10);
	    capeCod.addEdge(truro, provincetown, 10);
	    capeCod.addEdge(truro, orleans, 17);
	    capeCod.addEdge(orleans, truro, 17);
	    capeCod.addEdge(orleans, chatham, 9);
	    capeCod.addEdge(orleans, barnstable, 19);
	    capeCod.addEdge(chatham, orleans, 9);
	    capeCod.addEdge(chatham, hyannis, 19);
	    capeCod.addEdge(hyannis, chatham, 19);
	    capeCod.addEdge(hyannis, barnstable, 4);
	    capeCod.addEdge(hyannis, falmouth, 20);
	    capeCod.addEdge(barnstable, orleans, 19);
	    capeCod.addEdge(barnstable, hyannis, 4);
	    capeCod.addEdge(barnstable, sandwich, 12);
	    capeCod.addEdge(sandwich, barnstable, 12);
	    capeCod.addEdge(falmouth, hyannis, 20);
		
	    // Example 1: Graph operations for Provincetown
		
		Queue<String> provincetownBFT = capeCod.getBreadthFirstTraversal(provincetown);
		Queue<String> provincetownDFT = capeCod.getDepthFirstTraversal(provincetown);
		Deque<String> provincetownToSandwichCheapestPath = new LinkedList<>();
		double provincetownToSandwichDistance = capeCod.getCheapestPath(provincetown, sandwich, provincetownToSandwichCheapestPath);
		Deque<String> provincetownToSandwichShortestPath = new LinkedList<>();
		int provincetownToSandwichShortestLength = capeCod.getShortestPath(provincetown, sandwich, provincetownToSandwichShortestPath);

		System.out.println("Breadth-first traversal for Provincetown: ");
		for(String city : provincetownBFT) {
			System.out.println(city);
		}
		
		System.out.println("\nDepth-first traversal for Provincetown: ");
		for(String city : provincetownDFT) {
			System.out.println(city);
		}
		
		System.out.println("\nCheapest path from Provincetown to Sandwich: " + provincetownToSandwichDistance + " miles");
		for(String city : provincetownToSandwichCheapestPath) {
			System.out.println(city);
		}
		
		System.out.println("\nShortest path from Provincetown to Sandwich: " + provincetownToSandwichShortestLength + " edges");
		for(String city : provincetownToSandwichShortestPath) {
			System.out.println(city);
		}
		
		// Example 2: Graph operations for Falmouth
		
		Queue<String> falmouthBFT = capeCod.getBreadthFirstTraversal(falmouth);
		Queue<String> falmouthDFT = capeCod.getDepthFirstTraversal(falmouth);
		Deque<String> falmouthToProvincetownCheapestPath = new LinkedList<>();
		double falmouthToProvincetownDistance = capeCod.getCheapestPath(falmouth, provincetown, falmouthToProvincetownCheapestPath);
		Deque<String> falmouthToProvincetownShortestPath = new LinkedList<>();
		int falmouthToProvincetownLength = capeCod.getShortestPath(falmouth, provincetown, falmouthToProvincetownShortestPath);
		
		System.out.println("\nBreadth-first traversal for Falmouth: ");
		for(String city : falmouthBFT) {
			System.out.println(city);
		}
		
		System.out.println("\nDepth-first traversal for Falmouth: ");
		for(String city : falmouthDFT) {
			System.out.println(city);
		}
		
		System.out.println("\nCheapest path from Falmouth to Provincetown: " + falmouthToProvincetownDistance + " miles");
		for(String city : falmouthToProvincetownCheapestPath) {
			System.out.println(city);
		}
		
		System.out.println("\nShortest path from Falmouth to Provincetown: " + falmouthToProvincetownLength + " edges");
		for(String city : falmouthToProvincetownShortestPath) {
			System.out.println(city);
		}
		
	} // end main

}
