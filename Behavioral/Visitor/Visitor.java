package Pattern.Behavioral.Visitor;

public interface Visitor {
    double visit(Table table);
    double visit(Chair chair);
}
