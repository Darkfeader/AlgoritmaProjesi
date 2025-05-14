package proje;

import java.util.Scanner;

public class YazılımDilleriProjesi {
	public static void main(String[] args) {
		System.out.println("\u001B[31m******Yazılım Dilleri*****\u001B[0m");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\u001B[32mSeçmek istediğiniz Kategoriyi Seçin!!\u001B[0m");
		System.out.println("\u001B[34mSeçenekler:\u001B[0m");
		System.out.println("1- Kolaylık");
		System.out.println("2- Çeşitlilik");
		System.out.println("3- Başlangıç için");
		System.out.println("4- Web Geliştirme için");
		System.out.println("5- Popüler");
		System.out.println("6- Orta");
		System.out.println("7- Zor");
		System.out.println("8- Oyun");
		System.out.println("\u001B[34mDilleri görmek için:\u001B[0m");
		System.out.println("9-(Diller)");
		System.out.println("\u001B[32mSeç:\u001B[0m");
		int sayi1=scanner.nextInt();
		if (sayi1<11) {
			switch (sayi1) {
			case 1:
				System.out.println("\u001B[34mŞunlar:\u001B[0m");
				System.out.println("1-Java "+"\n"+"2-Html "+"\n"+"3-Python "+"\n");
				System.out.println("\u001B[34mSeçebilirsiniz:\u001B[0m");
				int sayii=scanner.nextInt();
				switch (sayii) {
				case 1:
					System.out.print("Java programlama dili nesnel tabanlı bir yazılım dilidir. Yani açık kodlu olup nesneye yöneliktir. Öğrenilmesi kolay bir dildir. Java web tabanlı uygulamalar, Android işletim sistemi ile geliştirilmiş oyun ve uygulamalarda tercih edilir. ");
					break;
				case 2:
					System.out.print("Öğrenme kolaylığı en yüksek yazılım dillerinden biri olan HTML, basit bir yazılım dilidir. İnternet sitesi oluşturmak için bilinmesi gereken dillerdendir.");
					break;
				case 3:
					System.out.print("1991 yılında Guido Van Rossum tarafından geliştirilen Python, basit ve dinamik bir programlama dili olması ile dikkat çeker. Çok az kodla çok iş yapılabilmektedir. Python programlama dili hemen hemen tüm işletim sistemlerinde kullanılmaktadır. Sistem programlama, uygulama programlama, web programlama gibi birçok alanda kullanılabilen gelişmiş bir programlama dilidir. Yazılıma başlamak isteyenler için 2. veya 3. yazılım dili olarak öğrenilmesi önerilmektedir.");
					break;
				default:
					System.out.println("\u001B[31mGeçersiz\u001B[0m");
					break;
				}
				break;
			case 2:
				System.out.println("\u001B[34mŞunlar:\u001B[0m");
				System.out.println("1-C++"+"\n"+"2-Java"+"\n"+"3-C#"+"\n"+"4-Python");
				System.out.println("\u001B[34mSeçebilirsiniz:\u001B[0m");
				int sayii1=scanner.nextInt();
				switch (sayii1) {
				case 1:
					System.out.print("C++, 1979 yılında Bjarne Stroustrup tarafından geliştirilmiştir. Programlama dilleri arasında en çok kullanılan dillerden biridir. C yazılım dilinin eklentisidir. Orta seviyeli bir yazılım dilidir. Orta seviyeli olduğu için yüksek seviyeli diller ile birlikte kullanılması, ürünün performansını artırmaktadır. C++ programlama dili işletim sistemleri, oyun, görüntü işleme gibi alanlarda tercih edilir.");
					break;
				case 2:
					System.out.print("Java programlama dili nesnel tabanlı bir yazılım dilidir. Yani açık kodlu olup nesneye yöneliktir. Öğrenilmesi kolay bir dildir. Java web tabanlı uygulamalar, Android işletim sistemi ile geliştirilmiş oyun ve uygulamalarda tercih edilir. ");
					break;
				case 3:
					System.out.print("Microsoft tarafından geliştirilen C# programlama dili, kullanıcı arabirimi tasarlamak için oluşturulmuştur. C ve C++ programlama dillerinin bir araya getirilmesi ile oluşturulmuştur. Teknik olarak bu dile hakim olunması oldukça önemlidir. Windows form uygulamaları, mobil ve konsol uygulamaları, oyunlar, web servisleri gibi alanlarda tercih edilir.");
					break;
				case 4:
					System.out.print("1991 yılında Guido Van Rossum tarafından geliştirilen Python, basit ve dinamik bir programlama dili olması ile dikkat çeker. Çok az kodla çok iş yapılabilmektedir. Python programlama dili hemen hemen tüm işletim sistemlerinde kullanılmaktadır. Sistem programlama, uygulama programlama, web programlama gibi birçok alanda kullanılabilen gelişmiş bir programlama dilidir. Yazılıma başlamak isteyenler için 2. veya 3. yazılım dili olarak öğrenilmesi önerilmektedir.");
					break;
				default:
					System.out.println("\u001B[31mGeçersiz\u001B[0m");
					break;
				}
				break;
			case 3:
				System.out.println("\u001B[34mŞunlar:\u001B[0m");
				System.out.println("1-Java"+"\n"+"2-Python"+"\n"+"3-Html"+"\n"+"4-Css");
				System.out.println("\u001B[34mSeçebilirsiniz:\u001B[0m");
				int say=scanner.nextInt();
				switch (say) {
				case 1:
					System.out.print("Java programlama dili nesnel tabanlı bir yazılım dilidir. Yani açık kodlu olup nesneye yöneliktir. Öğrenilmesi kolay bir dildir. Java web tabanlı uygulamalar, Android işletim sistemi ile geliştirilmiş oyun ve uygulamalarda tercih edilir. ");
					break;
				case 2:
					System.out.print("1991 yılında Guido Van Rossum tarafından geliştirilen Python, basit ve dinamik bir programlama dili olması ile dikkat çeker. Çok az kodla çok iş yapılabilmektedir. Python programlama dili hemen hemen tüm işletim sistemlerinde kullanılmaktadır. Sistem programlama, uygulama programlama, web programlama gibi birçok alanda kullanılabilen gelişmiş bir programlama dilidir. Yazılıma başlamak isteyenler için 2. veya 3. yazılım dili olarak öğrenilmesi önerilmektedir.");
				break;
				case 3:
					System.out.print("Öğrenme kolaylığı en yüksek yazılım dillerinden biri olan HTML, basit bir yazılım dilidir. İnternet sitesi oluşturmak için bilinmesi gereken dillerdendir.");
					break;
				case 4:
					System.out.print("Web sitesi yapımı için gerekli dillerden biri olan CSS, HTML kodları gibi basit öğrenilebilecek bir yapıya sahiptir. CSS programlama dili, web sitelerinin fontları, renkleri, ara başlıkları, görsel efektleri gibi unsurları oluşturmak için tercih edilmektedir.");
					break;
				default:
					System.out.println("\u001B[31mGeçersiz\u001B[0m");
					break;
				}
				break;
			case 4:
				System.out.println("\u001B[34mŞunlar:\u001B[0m");
				System.out.println("1-Java"+"\n"+"2-C#"+"\n"+"3-Python"+"\n"+"4-Html"+"\n"+"5-Css"+"\n"+"6-Php");
				System.out.println("\u001B[34mSeçebilirsiniz:\u001B[0m");
				int say1=scanner.nextInt();
				switch (say1) {
				case 1:
					System.out.print("Java programlama dili nesnel tabanlı bir yazılım dilidir. Yani açık kodlu olup nesneye yöneliktir. Öğrenilmesi kolay bir dildir. Java web tabanlı uygulamalar, Android işletim sistemi ile geliştirilmiş oyun ve uygulamalarda tercih edilir. ");
					break;
				case 2:
					System.out.print("Microsoft tarafından geliştirilen C# programlama dili, kullanıcı arabirimi tasarlamak için oluşturulmuştur. C ve C++ programlama dillerinin bir araya getirilmesi ile oluşturulmuştur. Teknik olarak bu dile hakim olunması oldukça önemlidir. Windows form uygulamaları, mobil ve konsol uygulamaları, oyunlar, web servisleri gibi alanlarda tercih edilir.");
					break;
				case 3:
					System.out.print("1991 yılında Guido Van Rossum tarafından geliştirilen Python, basit ve dinamik bir programlama dili olması ile dikkat çeker. Çok az kodla çok iş yapılabilmektedir. Python programlama dili hemen hemen tüm işletim sistemlerinde kullanılmaktadır. Sistem programlama, uygulama programlama, web programlama gibi birçok alanda kullanılabilen gelişmiş bir programlama dilidir. Yazılıma başlamak isteyenler için 2. veya 3. yazılım dili olarak öğrenilmesi önerilmektedir.");
					break;
				case 4:
					System.out.print("Öğrenme kolaylığı en yüksek yazılım dillerinden biri olan HTML, basit bir yazılım dilidir. İnternet sitesi oluşturmak için bilinmesi gereken dillerdendir.");
					break;
				case 5:
					System.out.print("Web sitesi yapımı için gerekli dillerden biri olan CSS, HTML kodları gibi basit öğrenilebilecek bir yapıya sahiptir. CSS programlama dili, web sitelerinin fontları, renkleri, ara başlıkları, görsel efektleri gibi unsurları oluşturmak için tercih edilmektedir.");
					break;
				case 6:
					System.out.print("İnternet sitelerinin kullanıcılar tarafından görüntülenmesini sağlayan PHP programlama dili, HTML ve CSS gibi farklı yazılım dilleriyle kodlanarak ortaya çıkmıştır. Web sistemlerin kurulmasında tercih edilir. Facebook, Twitter, Google arama motoru gibi alanlar bu dilin kullanılması ile oluşturulur.");
					break;
				default:
					System.out.println("\u001B[31mGeçersiz\u001B[0m");
					break;
				}
				break;
			case 5:
				System.out.println("\u001B[34mŞunlar:\u001B[0m");
				System.out.println("1-Java"+"\n"+"2-C++"+"\n"+"3-Python");
				System.out.println("\u001B[34mSeçebilirsiniz:\u001B[0m");
				int sayi2=scanner.nextInt();
				switch (sayi2) {
				case 1:
					System.out.print("Java programlama dili nesnel tabanlı bir yazılım dilidir. Yani açık kodlu olup nesneye yöneliktir. Öğrenilmesi kolay bir dildir. Java web tabanlı uygulamalar, Android işletim sistemi ile geliştirilmiş oyun ve uygulamalarda tercih edilir. ");
					break;
				case 2:
					System.out.print("C++, 1979 yılında Bjarne Stroustrup tarafından geliştirilmiştir. Programlama dilleri arasında en çok kullanılan dillerden biridir. C yazılım dilinin eklentisidir. Orta seviyeli bir yazılım dilidir. Orta seviyeli olduğu için yüksek seviyeli diller ile birlikte kullanılması, ürünün performansını artırmaktadır. C++ programlama dili işletim sistemleri, oyun, görüntü işleme gibi alanlarda tercih edilir.");
					break;
				case 3:
					System.out.print("1991 yılında Guido Van Rossum tarafından geliştirilen Python, basit ve dinamik bir programlama dili olması ile dikkat çeker. Çok az kodla çok iş yapılabilmektedir. Python programlama dili hemen hemen tüm işletim sistemlerinde kullanılmaktadır. Sistem programlama, uygulama programlama, web programlama gibi birçok alanda kullanılabilen gelişmiş bir programlama dilidir. Yazılıma başlamak isteyenler için 2. veya 3. yazılım dili olarak öğrenilmesi önerilmektedir.");
					break;
				default:
					System.out.println("\u001B[31mGeçersiz\u001B[0m");
					break;
				}
				break;
			case 6:
				System.out.println("\u001B[34mŞu:\u001B[0m");
				System.out.println("1-C++");
				System.out.println("\u001B[34mSeçebilirsiniz:\u001B[0m");
				int sayi3=scanner.nextInt();
				switch (sayi3) {
				case 1:
					System.out.print("C++, 1979 yılında Bjarne Stroustrup tarafından geliştirilmiştir. Programlama dilleri arasında en çok kullanılan dillerden biridir. C yazılım dilinin eklentisidir. Orta seviyeli bir yazılım dilidir. Orta seviyeli olduğu için yüksek seviyeli diller ile birlikte kullanılması, ürünün performansını artırmaktadır. C++ programlama dili işletim sistemleri, oyun, görüntü işleme gibi alanlarda tercih edilir.");
					break;
				default:
					System.out.println("\u001B[31mGeçersiz\u001B[0m");
					break;
				}
				break;
			case 7:
				System.out.println("\u001B[34mŞu:\u001B[0m");
				System.out.println("1-C#");
				System.out.println("\u001B[34mSeçebilirsiniz:\u001B[0m");
				int sayi4=scanner.nextInt();
				switch (sayi4) {
				case 1:
					System.out.print("Microsoft tarafından geliştirilen C# programlama dili, kullanıcı arabirimi tasarlamak için oluşturulmuştur. C ve C++ programlama dillerinin bir araya getirilmesi ile oluşturulmuştur. Teknik olarak bu dile hakim olunması oldukça önemlidir. Windows form uygulamaları, mobil ve konsol uygulamaları, oyunlar, web servisleri gibi alanlarda tercih edilir.");
					break;
				default:
					System.out.println("\u001B[31mGeçersiz\u001B[0m");
					break;
				}
				break;
			case 8:
				System.out.println("\u001B[34mŞunlar:\u001B[0m");
				System.out.println("1-Java"+"\n"+"2-C++"+"\n"+"3-C#");
				System.out.println("\u001B[34mSeçebilirsiniz:\u001B[0m");
				int sayi5=scanner.nextInt();
				switch (sayi5) {
				case 1:
					System.out.print("Java programlama dili nesnel tabanlı bir yazılım dilidir. Yani açık kodlu olup nesneye yöneliktir. Öğrenilmesi kolay bir dildir. Java web tabanlı uygulamalar, Android işletim sistemi ile geliştirilmiş oyun ve uygulamalarda tercih edilir. ");
					break;
				case 2:
					System.out.print("C++, 1979 yılında Bjarne Stroustrup tarafından geliştirilmiştir. Programlama dilleri arasında en çok kullanılan dillerden biridir. C yazılım dilinin eklentisidir. Orta seviyeli bir yazılım dilidir. Orta seviyeli olduğu için yüksek seviyeli diller ile birlikte kullanılması, ürünün performansını artırmaktadır. C++ programlama dili işletim sistemleri, oyun, görüntü işleme gibi alanlarda tercih edilir.");
					break;
				case 3:
					System.out.print("Microsoft tarafından geliştirilen C# programlama dili, kullanıcı arabirimi tasarlamak için oluşturulmuştur. C ve C++ programlama dillerinin bir araya getirilmesi ile oluşturulmuştur. Teknik olarak bu dile hakim olunması oldukça önemlidir. Windows form uygulamaları, mobil ve konsol uygulamaları, oyunlar, web servisleri gibi alanlarda tercih edilir.");
					break;
				default:
					System.out.println("\u001B[31mGeçersiz\u001B[0m");
					break;
				}
				break;
			case 9:
				System.out.println("\u001B[31m*********************************\u001B[0m");
				System.out.println("1-Java");
				System.out.println("2-C++");
				System.out.println("3-Python");
				System.out.println("4-C#");
				System.out.println("5-HTML");
				System.out.println("6-CSS");
				System.out.println("7-PHP");
				System.out.println("\u001B[34mBilgi sahibi olmak istediğiniz dili seçiniz:\u001B[0m");
				break;
			default:
				System.out.println("\u001B[31mHatalı tuşlama!\u001B[0m");
				break;
			}
		}
		else {
			System.out.println("******************************************");
			System.out.println("1-Java");
			System.out.println("2-C++");
			System.out.println("3-Python");
			System.out.println("4-C#");
			System.out.println("5-HTML");
			System.out.println("6-CSS");
			System.out.println("7-PHP");
			System.out.println("\u001B[34mBilgi sahibi olmak istediğiniz dili seçiniz:\u001B[0m");
		}
		int sayi3 = scanner.nextInt();
		switch (sayi3) {
		case 1:
			System.out.print("Java programlama dili nesnel tabanlı bir yazılım dilidir. Yani açık kodlu olup nesneye yöneliktir. Öğrenilmesi kolay bir dildir. Java web tabanlı uygulamalar, Android işletim sistemi ile geliştirilmiş oyun ve uygulamalarda tercih edilir. ");
			break;
		case 2:
			System.out.print("C++, 1979 yılında Bjarne Stroustrup tarafından geliştirilmiştir. Programlama dilleri arasında en çok kullanılan dillerden biridir. C yazılım dilinin eklentisidir. Orta seviyeli bir yazılım dilidir. Orta seviyeli olduğu için yüksek seviyeli diller ile birlikte kullanılması, ürünün performansını artırmaktadır. C++ programlama dili işletim sistemleri, oyun, görüntü işleme gibi alanlarda tercih edilir.");
			break;
		case 3:
			System.out.print("1991 yılında Guido Van Rossum tarafından geliştirilen Python, basit ve dinamik bir programlama dili olması ile dikkat çeker. Çok az kodla çok iş yapılabilmektedir. Python programlama dili hemen hemen tüm işletim sistemlerinde kullanılmaktadır. Sistem programlama, uygulama programlama, web programlama gibi birçok alanda kullanılabilen gelişmiş bir programlama dilidir. Yazılıma başlamak isteyenler için 2. veya 3. yazılım dili olarak öğrenilmesi önerilmektedir.");
			break;
		case 4:
			System.out.print("Microsoft tarafından geliştirilen C# programlama dili, kullanıcı arabirimi tasarlamak için oluşturulmuştur. C ve C++ programlama dillerinin bir araya getirilmesi ile oluşturulmuştur. Teknik olarak bu dile hakim olunması oldukça önemlidir. Windows form uygulamaları, mobil ve konsol uygulamaları, oyunlar, web servisleri gibi alanlarda tercih edilir.");
			break;
		case 5:
			System.out.print("Öğrenme kolaylığı en yüksek yazılım dillerinden biri olan HTML, basit bir yazılım dilidir. İnternet sitesi oluşturmak için bilinmesi gereken dillerdendir.");
			break;
		case 6:
			System.out.print("Web sitesi yapımı için gerekli dillerden biri olan CSS, HTML kodları gibi basit öğrenilebilecek bir yapıya sahiptir. CSS programlama dili, web sitelerinin fontları, renkleri, ara başlıkları, görsel efektleri gibi unsurları oluşturmak için tercih edilmektedir.");
			break;
		case 7:
			System.out.print("İnternet sitelerinin kullanıcılar tarafından görüntülenmesini sağlayan PHP programlama dili, HTML ve CSS gibi farklı yazılım dilleriyle kodlanarak ortaya çıkmıştır. Web sistemlerin kurulmasında tercih edilir. Facebook, Twitter, Google arama motoru gibi alanlar bu dilin kullanılması ile oluşturulur.");
			break;
		default:
			System.out.println("\u001B[31mGeçersiz\u001B[0m");
			break;

		}
	}
}