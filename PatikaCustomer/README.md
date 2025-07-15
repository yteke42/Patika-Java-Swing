# Java Swing ile Sipariş Yönetim Sistemi

Bu proje, Java Swing kullanılarak geliştirilen bir Sipariş Yönetim Sistemi'dir. Henüz tamamlanmamıştır ve geliştirme aşamasındadır.

## Özellikler (Şu Ana Kadar)
- Kullanıcı girişi (E-posta ve şifre doğrulama)
- Başarılı giriş sonrası Dashboard arayüzü
- MySQL veritabanı bağlantısı (Bağlantı bilgileri `core/Database.java` dosyasındadır)
- Temel yardımcı (utility) fonksiyonlar

## Proje Yapısı
- `src/` : Kaynak kodları (iş mantığı, yardımcılar, DAO, entity ve arayüzler)
- `lib/` : Harici kütüphaneler (ör. MySQL connector)
- `bin/` : Derlenmiş sınıf dosyaları

## Kurulum ve Çalıştırma
1. Java ve MySQL'in yüklü olduğundan emin olun.
2. MySQL JDBC sürücüsünü (`mysql-connector-j-9.3.0.jar`) classpath'e ekleyin.
3. Gerekirse `core/Database.java` dosyasındaki veritabanı bağlantı bilgilerini güncelleyin.
4. Projeyi derleyin:
   ```
   javac -cp "lib/mysql-connector-j-9.3.0.jar" -d bin src/**/*.java
   ```
5. Uygulamayı çalıştırın:
   ```
   java -cp "bin;lib/mysql-connector-j-9.3.0.jar" App
   ```
   (Unix tabanlı sistemlerde `;` yerine `:` kullanın)

## Notlar
- Proje henüz tamamlanmamıştır. Yeni özellikler ve iyileştirmeler eklenecektir.
- Geliştirme sırasında karşılaşabileceğiniz hatalar ve eksiklikler için lütfen geri bildirimde bulunun.

---

Geliştirici: [Patika.dev Java Swing Eğitimi]

---

# Java Swing Order Management System

This project is an Order Management System developed using Java Swing. It is not finished yet and is currently under development.

## Features (So Far)
- User login (email and password validation)
- Dashboard interface after successful login
- MySQL database connection (connection info is in `core/Database.java`)
- Basic utility functions

## Project Structure
- `src/`: Source code (business logic, utilities, DAO, entity, and UI)
- `lib/`: External libraries (e.g., MySQL connector)
- `bin/`: Compiled class files

## Setup and Running
1. Make sure you have Java and MySQL installed.
2. Add the MySQL JDBC driver (`mysql-connector-j-9.3.0.jar`) to your classpath.
3. Update the database connection info in `core/Database.java` if needed.
4. Compile the project:
   ```
   javac -cp "lib/mysql-connector-j-9.3.0.jar" -d bin src/**/*.java
   ```
5. Run the application:
   ```
   java -cp "bin;lib/mysql-connector-j-9.3.0.jar" App
   ```
   (On Unix-based systems, replace `;` with `:`)

## Notes
- The project is not finished yet. More features and improvements will be added.
- Please provide feedback for any errors or missing features you encounter during development.

---

Developer: [Patika.dev Java Swing Course]
