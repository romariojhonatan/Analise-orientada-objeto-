
public class Main {
	public static void main(String[] args) {
		Diciplina a = new Diciplina();
		a.nome = "Algoritimo";
		Diciplina b = new Diciplina();
		b.nome = "UML";
		a.pre_req = b;
		a.pre_req.nome = "Fiscal";
	}

}
