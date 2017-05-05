package index;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface IndexInterface {
	
	int getMinimumCoreIndex(List<Integer> queryNodes);
	
	Set<Integer> getNeighbors(int node, int coreIndex);
        
	Set<Integer> getNeighbors(int node, int coreIndex, Set<Integer> subcore);
	
	int getCoreMinimumDegree(int coreIndex);
	
	int getNumberOfNodes(int coreIndex);

	Set<Integer> getNodes();
        
	Set<Integer> getCore(List<Integer> queryNodes);
}
