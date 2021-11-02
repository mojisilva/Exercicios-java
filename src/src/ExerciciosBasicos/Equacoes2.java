package ExerciciosBasicos;

public class Equacoes2 {
    public static void main(String[] args) {
        float a = 8, b = 5, c= -4, d = 2;
        float delta = b* 2 - 4  * a*c;
        float media1 = (a+b+c+d)/4;
        float media2 = a+b+c+d/4;
        float mod1 = a%d/5;
        float mod2 = (a%d)/5;
        float x1 = (a+b) -10*c;
        float x2 = a+b -10*c;
        boolean y1 = true;
        if((a>b) && (b+c>d)) {
            y1 = true;
            System.out.println(y1);
        }else{
            y1 = false;
            System.out.println(y1);
        }
        if((a>3*2) || (b+c!=d)) {
            y1 = true;
            System.out.println(y1);
        }else{
            y1 = false;
            System.out.println(y1);
        }
        System.out.println(delta);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(mod1);
        System.out.println(mod2);
        System.out.println(x1);
        System.out.println(x2);


    }
}
