package chapter12.Generics;

// 제너릭 기능이 있는 GenericPrinter 클래스
// class 클래스명 <알파벳 문자> 			 <T> : 타입 파라미터. T에는 참조타입만 사용 가능
public class GenericPrinter<T extends Material> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}	
}
