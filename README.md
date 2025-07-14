# Food Ordering Application
Bu proje, temel bir yemek sipariş sistemi geliştirmeyi amaçlayan bir web uygulamasıdır. RESTful API mimarisi kullanılarak geliştirilmiştir ve kullanıcıların güvenli bir şekilde sisteme erişimi için JWT tabanlı kimlik doğrulama ve yetkilendirme mekanizmaları entegre edilmiştir.

## Kullanılan Teknolojiler
### Java 17
### Spring Boot
### Spring Security
### JWT
### JUnit & Mockito (Test için)

## Özellikler
### Kullanıcı kaydı ve giriş işlemleri
### JWT (JSON Web Token) ile oturum yönetimi
### Rollere göre yetkilendirme (user, admin)
### Spring Boot ile geliştirilmiş backend mimarisi

## Testler
Uygulamanın CustomerService sınıfı için unit testler yazılmıştır. Bu testlerde servis katmanının beklenen şekilde çalışıp 
çalışmadığı mock objeler kullanılarak kontrol edilmiştir. Böylece iş mantığının doğruluğu garanti altına alınmıştır.

## API Testi
### JWT Token oluşturma
#### POST - localhost:8081/login/save
<img width="630" height="367" alt="token" src="https://github.com/user-attachments/assets/c9deb39a-8c14-41af-b6c8-8246a8bb8102" />


### Yeniden Token Oluşturmak için
#### POST - localhost:8081/login/auth 
<img width="644" height="377" alt="tekrar_token_oluşturma" src="https://github.com/user-attachments/assets/6561b4b3-587f-4716-9ade-b7719eb146d5" />





