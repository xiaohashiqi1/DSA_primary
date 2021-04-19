package demo04;

public class Josephu {
    public static void main(String[] args) {
        CircleLinkedList circleLinkedList = new CircleLinkedList();
        circleLinkedList.addBoy(5);
        circleLinkedList.showBoy();
        circleLinkedList.countBoy(1,2,5);
    }
}

class CircleLinkedList {
    private boy first = null;

    public void countBoy(int startNo, int count, int nums) {
        boy helper = first;

        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("参数输入有误，请重新输入");
            return;
        }
        while (true) {
            if (helper.getNext() == first) {
                break;
            }
            helper = helper.getNext();
        }
        for (int i = 0; i < startNo - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        while (true) {
            if (helper == first) {
                break;
            }
            for (int i = 0; i < count - 1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.printf("小孩%d出圈", first.getNum());
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后留在圈中的小孩编号%d\n", first.getNum());
    }

    public void addBoy(int num) {
        if (num < 1) {
            System.out.println("不足以创建环形链表");
            return;
        }
        boy curBoy = null;
        for (int i = 1; i <= num; i++) {
            boy boy = new boy(i);
            if (i == 1) {
                first = boy;
                first.setNext(first);
                curBoy = first;
            } else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }

    public void showBoy() {
        if (first == null) {
            System.out.println("链表为空");
            return;
        }
        boy curBoy = first;
        while (true) {
            System.out.printf("小孩的编号%d\n", curBoy.getNum());
            if (curBoy.getNext() == first) {
                break;
            }
            curBoy = curBoy.getNext();
        }
    }
}

class boy {
    private int num;
    private boy next;

    public int getNum() {
        return num;
    }

    public boy(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boy getNext() {
        return next;
    }

    public void setNext(boy next) {
        this.next = next;
    }

}