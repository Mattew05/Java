public class compulsory
{
	public static void main(String[] args) {
		System.out.println("Hello World\n");
		String[] Languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
		int n = (int) (Math.random() * 1_000_000);
		System.out.println(n);
		n=n*3;
		n=n+0b10101;
		n=n+0xFF;
		n=n*6;
		System.out.println(n);
		int x=n;
		while(x>10){
		    x=(x/10)+(x%10);//cifra de control
		}
		System.out.println(x);// x e defapt result, da am pus x ca era prea mult de scris
		System.out.println("Willy-nilly, this semester I will try to learn and definitely not fail to learn " + Languages[x]);
	}
}
