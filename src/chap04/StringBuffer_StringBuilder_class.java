package chap04;

public class StringBuffer_StringBuilder_class {
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("����̳̹�����");
		sBuffer.append("www");
		sBuffer.append(".runoob");
		sBuffer.append(".com");
		
		System.out.println(sBuffer);
		System.out.println(sBuffer.reverse()); // �����ַ��������䷴ת��ʽȡ��
		System.out.println(sBuffer.delete(0, 2)); // �Ƴ������е����ַ����е��ַ�
		System.out.println(sBuffer.insert(0, 2)); // ��2���ڵ�0λ
		System.out.println(sBuffer.replace(1, 2, "abcd")); // ��[1,2)֮����ַ��滻Ϊ�ַ���
		
		System.out.println("sBuffer�ĳ��ȣ�" + sBuffer.length());
		System.out.println("sBuffer��������" + sBuffer.capacity());
		sBuffer.append("123");
		System.out.println("sBuffer�ĳ��ȣ�" + sBuffer.length());
		System.out.println("sBuffer��������" + sBuffer.capacity()); // (23+1)*2
		
	}
}