/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rank;

import index.IndexInterface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import steinerTree.SteinerTreeLimited;

/**
 *
 * @author edotony
 */
public class ConnectionLimited {

    public static Set<Integer> heuristicRankWithST(IndexInterface index,
                                                       List<Integer> queryNodes,
                                                       int minimumCoreIndex, int maximumDepth) {
        Set<Integer> heuristicNodes = SteinerTreeLimited.buildSteinerTree(index, minimumCoreIndex, queryNodes, maximumDepth);
        return Greedy.heuristicRank(index, new ArrayList<>(heuristicNodes), minimumCoreIndex);
    }

}
