public class JavaBasic_SwitchDemo {
    public static void main(String[] args) {
        System.out.println("MY Java");
        char x ='i';
        switch(x)
        {
            case'i':
            case'L':
                System.out.println(x+"Is Launched for case testing:");
                break;
                case'w':
                    case'W':
                        System.out.println(x+"IS a ship:");
                        break;
            default:
                System.out.println(x+"IS other than leter digits or a switch provided:");

        }
    }
}
