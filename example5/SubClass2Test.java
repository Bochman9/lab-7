package lr7.example5;

public class SubClass2Test extends SuperClassTest {
    protected char ch;

    public SubClass2Test(String str, char ch) {
        super(str);
        this.ch = ch;
    }

    @Override
    public void showInfo() {
        String info = "Class name: " + this.getClass().getSimpleName() +
                ", str='" + super.getStr() + '\'' +
                ", ch=" + ch;
        System.out.println(info);
    }
}
