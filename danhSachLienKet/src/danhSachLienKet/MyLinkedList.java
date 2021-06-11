package danhSachLienKet;

/*
1.In ra gia tri ke cuoi
2.Tinh tong cac gia tri trong danh sach lien ket
3.Dem bao nhieu so chan
4.Tinh trung cong snt
5.Dao 2 node cuoi cho nhau
6.Dao 2 node dau cho nhau
7.Dao 2 node dau va cuoi
8.Dao nguoc dslk
9.Xoa cac gia tri am trong dslk
10.Gia su cho 1 dslk tach 2 danh sach lien ket 1 ds le, 1ds chan
11.Gop 2 ds bat ki thanh 1 ds theo tu tang dan(k dung ham sort)
12.Xoa trung nhau
 */
public class MyLinkedList<E> {
	private class Node {
		private E info;
		private Node next;

		public Node(E info) {
			this.info = info;
			this.next = null;
		}

		public Node(E info, Node next) {
			this.info = info;
			this.next = next;
		}
	}

	private int size;
	private Node head, tail;

	public MyLinkedList() {
		this.size = 0;
		this.head = this.tail = null;
	}

	public void add(E element) {
		Node p = new Node(element);
		if (size == 0)
			head = tail = p;
		else {
			p.next = head;
			head = p;
		}
		size++;
	}

	public String toString() {
		Node q = head;
		String s = " ";
		while (q != null) {
			s += q.info + " ";
			q = q.next;
		}
		return s;
	}

//	1.In ra gia tri ke cuoi
	public E nextTail() {
		Node q = head;
		while (q.next.next != null) {
			q = q.next;
		}
		return q.info;
	}

//	2.Tinh tong cac gia tri trong danh sach lien ket
	public int tinhTong() {
		Node q = head;
		int s = 0;
		while (q != null) {
			s += (int) q.info;
			q = q.next;
		}
		return s;
	}

// 	3.Dem bao nhieu so chan
	public int demSoChan() {
		Node q = head;
		int dem = 0;
		while (q != null) {
			if ((int) q.info % 2 == 0) {
				dem++;
			}
			q = q.next;
		}
		return dem;
	}

	int ktnt(int n) {
		if (n < 2)
			return 0;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return 0;
		return 1;
	}

//	4.Tinh trung cong snt
	public float tbcSnt() {
		Node q = head;
		int dem = 0;
		int tong = 0;
		while (q != null) {
			if (ktnt((int) q.info) == 1) {
				dem++;
				tong += (int) q.info;
			}
			q = q.next;
		}
		return (float) tong / (float) dem;
	}

// 5.Dao 2 node cuoi cho nhau
	public void daoHaiCuoi() {
	//Cach 1:
		/*if (head.next == tail) {
			tail.next = head;
			head.next = null;
			head = tail;
//			tail = head.next;
		} else {
			Node r = head;
			while (r.next.next.next != null) {
				r = r.next;
			}
			Node q = r.next;
			r.next = tail;
			tail.next = q;
			q.next = null;
			tail = q;
		}*/
	//Cach 2:
		Node r=head;
		while(r.next.next.next!=null) {
			r=r.next;
		}
		Node q=r.next;
		 r.next=tail;
		 tail.next=q;
		 q.next=null;
		 tail=q;
	}

// 6.Dao 2 node dau cho nhau
	public void daoHaiDau() {

		Node q = head.next;
		head.next = q.next;
		q.next = head;
		head = q;

	}

// 7.Dao 2 node dau va cuoi
	public void daoHaiNodeDauCuoi() {
//		Node q=head;
//		while(q.next!=tail) {
//		q=q.next;
//		}
//		q.next=head;
//		Node r=head.next;
//		tail.next=r;
//		head.next=null;
//		head=tail;
		Node q = head.next;
		q.next = head;
		Node r = head.next;
		tail.next = r;
		head.next = null;
		head = tail;
	}

// 8.Dao nguoc dslk
	public void dsDaoNguoc() {
		// tail=head;
		Node head1 = null;
		while (head != null) {
			Node q = head;
			head = head.next;
			q.next = head1;
			head1 = q;
		}
		head = head1;
	}

//	9.Xoa cac gia tri am trong dslk
	public void xoaAm() {
		while (head != null && (int) head.info < 0) { /// -1 2 -5 4 -6 -3 -2 null
			head = head.next;
		}
		if (head == null) {
			tail = null;
			System.out.print(" Khong co so duong");
		} else { /// 4 2 -6 3 -2 null
			Node q = head;
			Node r = head.next;
			while (r != null) {
				if ((int) r.info >= 0) {
					q.next = r;
					q = r;
					r = r.next;
				} else {
					r = r.next;
				}
			}
			tail = q;
			tail.next = null;
		}
	}

//10.Gia su cho 1 dslk tach 2 danh sach lien ket 1 ds le, 1ds chan
		public void tach() {
			MyLinkedList list1 = new MyLinkedList();
			MyLinkedList list2 = new MyLinkedList();
			while (head != null) {// 8 7 6 5 4 3 2 null
				if ((int) head.info % 2 == 0) {
					list1.add((int) head.info);
				} else {
					list2.add((int) head.info);
				}
				head = head.next;
			}
			head = tail = null;
			System.out.print("\nTach chan:");
			System.out.print(list1);
			System.out.print("\nTach le:");
			System.out.print(list2);
		}

//11.Gop 2 ds bat ki thanh 1 ds theo tu tang dan(k dung ham sort)
	public void gopDs() {
		MyLinkedList list1 = new MyLinkedList();
		MyLinkedList list2 = new MyLinkedList();
		list1.add(1);
		list1.add(5);
		list1.add(6);
		list1.add(7);
//		list2.add(10);
//		list2.add(12);
//		list2.add(18);

		list2.add(2);
		list2.add(3);
		list2.add(8);
		list2.add(9);

		MyLinkedList list3 = new MyLinkedList();
		Node head1 = list1.head;
		Node head2 = list2.head;
		while (head1 != null && head2 != null) { // list1:1 5 6 7 10 12 18
			if ((int) head1.info > (int) head2.info) { // list2:2 3 8 9
				list3.add(head1.info); // list3: 1 2 3 5 6 7 8 9 10 12 18
				head1 = head1.next;
			} else {
				list3.add(head2.info);
				head2 = head2.next;
			}
		}
		if (head1 == null) {
			list3.add(head2.info);
		} else {
			list3.add(head1.info);
		}
		System.out.print(list3);
	}
//		if(head2==null) {
//			while(head1!=null) {
//				if((int)head2.info>(int)head1.info) {
//					head1=head1.next;
//				}else{
//					list3.add(head1.info);
//				}
//			}
//		}

//		if (head1 == null) {
//			list3.add(head2.info);
//		} else
//			list3.add(head1.info);
//		System.out.print(list3);

//		while (head1 != null) {
//				list3.add( head1.info);
//				head1 = head1.next;
//			}
//		E e = list3.head.info;
//		while (head2 != null) {
//			
//			if((int) list3.head.info < (int) head2.info) {
//				list3.add( head2.info);
//				head2 = head2.next;
//			}else {
//				
//				E tmp = e;
//				list3.head.info = head2.info;
//				while( head2 != null) {
//					if((int) tmp > (int)head2.info ) {
//						E tmp1 = head2.info;
//						head2.info = tmp;
//						tmp = tmp1;
//						head2 = head.next;
//					}else {
//						
//					}
//					
//				}
//				
//				
	

//12.Xoa trung
	public void xoaTrung() {
		Node r = head;
		Node q = null;
		Node p = null;
		while (r != null) {// 1 2 1 3 3 4
			q = r.next;
			p = r;
			while (q != null) {
				if ((int) r.info != (int) q.info) {
					p.next = q;
					p = q;
				}
				if (q == tail) {// && ((int) r.info == (int) tail.info)) {
					p.next = null;
					tail = p;
				}
				q = q.next;
			}
			r = r.next;
		}
	}

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(24);
		list.add(31);
		list.add(54);
		list.add(20);
		list.add(11);
		System.out.print(list);
//		System.out.print("\nIn ra vi tri ke cuoi:");
//		System.out.print(list.nextTail());
//		System.out.print("\nTong la:");
//		System.out.print(list.tinhTong());
//		System.out.print("\nDem so chan:");
//		System.out.print(list.demSoChan());
//		System.out.print("\nDiem trung binh:");
//		System.out.print(list.tbcSnt());
//		System.out.print("\nDao 2 node cuoi:");
//		list.daoHaiCuoi();
//		System.out.print(list);
//		System.out.print("\nDao 2 node dau:");
//		list.daoHaiDau();
//		System.out.print(list);
//		System.out.print("\nDao cuoi va dau:");
//		list.daoHaiNodeDauCuoi();
//		System.out.print(list);
//		System.out.print("\nDanh sach dao nguoc:");
//		list.dsDaoNguoc();
//		System.out.print(list);
//		System.out.print("\nXoa gia tri am:");
//		list.xoaAm();
//		System.out.print(list);
//		System.out.print("\nTach chan le:");
//		list.tach();
//		System.out.print("\nGop danh sach:");
//		list.gopDs();
//		System.out.print("\nXoa trung");
//		list.xoaTrung();
//		System.out.print(list);

	}
}
