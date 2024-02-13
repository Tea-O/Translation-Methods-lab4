import generated.lexisTest_for.LexicalAnalyzer;
import generated.parserTest_for.Parser;
import generated.parserTest_for.Tree;

import java.util.ArrayList;
import java.util.List;

public class ForTest {
    public static void main(String[] args) {
        String test = "int a(int *a, float ** b);";
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer(test);
        Parser parser = new Parser(lexicalAnalyzer);
        Tree parseTree = parser.s();
        List<Tree> leafNodes = new ArrayList<>();

        traverseTree(parseTree, leafNodes);

        // Выводим найденные листья
        System.out.println("Leaf nodes:");
        for (Tree leafNode : leafNodes) {
            System.out.println("Leaf: " + leafNode.getNode());
        }
    }

    private static void traverseTree(Tree node, List<Tree> leafNodes) {
        // Если узел является листовым, добавляем его в список
        if (node.isLeaf()) {
            leafNodes.add(node);
        } else {
            // Рекурсивно обходим дочерние узлы
            for (Tree child : node.getChildren()) {
                traverseTree(child, leafNodes);
            }
        }
    }
}

