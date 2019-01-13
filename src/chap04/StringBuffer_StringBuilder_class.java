package chap04;

public class StringBuffer_StringBuilder_class {
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
		sBuffer.append("www");
		sBuffer.append(".runoob");
		sBuffer.append(".com");
		
		System.out.println(sBuffer);
		System.out.println(sBuffer.reverse()); // 将此字符序列用其反转形式取代
		System.out.println(sBuffer.delete(0, 2)); // 移除此序列的子字符串中的字符
		System.out.println(sBuffer.insert(0, 2)); // 将2插在第0位
		System.out.println(sBuffer.replace(1, 2, "abcd")); // 将[1,2)之间的字符替换为字符串
		
		System.out.println("sBuffer的长度：" + sBuffer.length());
		System.out.println("sBuffer的容量：" + sBuffer.capacity());
		sBuffer.append("123");
		System.out.println("sBuffer的长度：" + sBuffer.length());
		System.out.println("sBuffer的容量：" + sBuffer.capacity()); // (23+1)*2
		
	}
}