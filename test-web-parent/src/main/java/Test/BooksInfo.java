package Test;

import java.util.Scanner;


public class BooksInfo {
	Scanner sc=new Scanner(System.in);
		String[] books=new String[10];//ͼ������
		int[] status=new int[10];//ͼ��״̬0�ɽ�1���ɽ�
		int[] counts=new int[10];//�������
		int[] dates=new int[10];//�������
		
		public void BooksInit(){

			BooksInfo[] booksInfos  = new BooksInfo[30];
			BooksInfo book = new BooksInfo();
			booksInfos[0] = book;

		books[0] ="��������";
		status[0]=0;
		counts[0]=10;
		
		books[1]="��¥��";
		status[1]=1;
		counts[1]=5;
		dates[1]=15;
		
		books[2]="ˮ䰴�";
		status[2]=0;
		counts[2]=8;
		dates[2]=6;
	}
		public void LookBooks(){
			System.out.println("���\t״̬\t����\t���ʱ��\t���Ĵ���");
			for(int i=0;i<books.length;i++){
				if(books[i]!=null){
					String statu=status[i]==0?"�ɽ�":"���ɽ�";
					String date=dates[i]==0?"":(dates[i]+"��");
					System.out.println((i+1)+"\t"+statu+"\t"+books[i]+
							"\t"+date+"\t"+counts[i]);
				}
				}
		}
		public void borrowBooks(){
			System.out.println("������Ҫ���ĵ�ͼ������:");
			String borrowBooks=sc.next();
			int borrow=-1;
			for(int i=0;i<books.length;i++){
				if(borrowBooks.equals(books[i])){
					borrow=i;
					break;
				}
			}
			if(borrow<0){
				System.out.println("��ͼ�鲻����");
			}else if(status[borrow]==1){
				System.out.println("��ͼ�鲻�ɽ�");
			}else{
				int date=0;
				do{
					System.out.println("���������ʱ��:");
					 date=sc.nextInt();
					if(date>=1&&date<=31){
						status[borrow]=1;
						dates[borrow]=date;
						counts[borrow]++;
						System.out.println("����ɹ�");
					}else{
						System.out.println("�������ʱ������,����������:");
						date=sc.nextInt();
					}
				}while(date<1||date>31);
			}
		}
		
		public void lendBooks(){
			System.out.println("������Ҫ�黹��ͼ������:");
			String lendBooks=sc.next();
			int lend=-1;
			for(int i=0;i<books.length;i++){
				if(lendBooks.equals(lendBooks)){
					lend=i;
					break;
				}
			}
			if(lend<0){
				System.out.println("��ͼ�鲻����");
			}else if(status[lend]==0){
				System.out.println("��ͼ�鲻�ɱ��黹");
			}else{
				int date=0;
				do{
					System.out.println("������黹����:");
					date=sc.nextInt();
					if(date>dates[lend]&&date<=31){
						status[lend]=0;
						dates[lend]=0;
						System.out.println("�黹ͼ��ɹ�");
					}else{
						System.out.println("�����������,����������:");
						date=sc.nextInt();
					}
				}while(date<dates[lend]||date>31);
			}
		}
	}

