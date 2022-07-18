package template;

public class Visitor {
    public void visit(Prisoner prisoner){
        System.out.println("----------我开始体验罪犯的一天-----------");
        prisoner.life();
        System.out.println("-------------结束了--------------");
    }

    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        Prisoner wyf = new StarPrisoner("吴亦凡");
        Prisoner cxk = new PoliticalPrisoner("蔡徐坤");
        visitor.visit(wyf);
        visitor.visit(cxk);
    }
}
