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
		System.out.println(sBuffer.insert(0, 2)); // ��2���ڵ�1λ
	}
}