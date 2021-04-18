package demo03;

public class HeroNodeDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "盖伦", "德玛西亚之力");
        HeroNode hero2 = new HeroNode(2, "德莱厄斯", "洛克萨斯之手");
        HeroNode hero3 = new HeroNode(3, "李青", "盲僧");
        HeroNode hero4 = new HeroNode(4, "易", "无极剑圣");
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.list();
    }
}
