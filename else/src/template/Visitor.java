package template;

public class Visitor {
    public void visit(Prisoner prisoner){
        System.out.println("----------�ҿ�ʼ�����ﷸ��һ��-----------");
        prisoner.life();
        System.out.println("-------------������--------------");
    }

    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        Prisoner wyf = new StarPrisoner("���ෲ");
        Prisoner cxk = new PoliticalPrisoner("������");
        visitor.visit(wyf);
        visitor.visit(cxk);
    }
}
