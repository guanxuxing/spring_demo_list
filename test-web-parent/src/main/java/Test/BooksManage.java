package Test;

import java.util.Scanner;


public class BooksManage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BooksInfo bi=new BooksInfo();
		bi.BooksInit();
		int choose=0;
		do{
		System.out.println("************��ӭ����ͼ�����ϵͳ*****************");
		System.out.println("1:�鿴ͼ��\n2:����ͼ��\n3:�黹ͼ��\n4:�˳�ϵͳ");
		System.out.println("��ѡ��:");
		choose=sc.nextInt();
		switch (choose) {
		case 1:
			//�鿴ͼ��
			bi.LookBooks();
			break;
		case 2:
			//����ͼ��
			bi.borrowBooks();
			break;
		case 3:
			//�黹ͼ��
			bi.lendBooks();
			break;
		case 4:
			//�˳�ϵͳ
			System.out.println("ллʹ��,�����˳�...");
			break;

		default:
			System.out.println("������������,����������");
			choose=sc.nextInt();
			break;
		}
	}while(choose!=4);
}
}