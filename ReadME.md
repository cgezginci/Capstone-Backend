# Veteriner Yönetim Sistemi API

Bu proje, bir veteriner kliniği yönetim sisteminin REST API'sini sunmaktadır.

![uml.png](./vetManagementSystem/assets/uml.png)


## Customer (Müşteri) Tablosu

- `POST /v1/customer`: Yeni bir müşteri ekler.
- `GET /v1/customer/{name}`: Belirtilen isme sahip müşteriyi ve sahip olduğu hayvanları getirir.
- `DELETE /v1/customer/{id}`: Belirtilen ID'ye sahip müşteriyi siler.
- `PUT /v1/customer`: Belirtilen müşteriyi günceller.
- `GET /v1/customer/{name}/{animalName}`: Belirtilen müşteri ismi ve hayvan ismiyle eşleşen hayvanları getirir.
- `GET /v1/customer/all`: Bütün müşterileri getirir.

## Animal (Hayvan) Tablosu

- `POST /v1/animal`: Yeni bir hayvan ekler.
- `GET /v1/animal/{name}`: Belirtilen isme sahip hayvanı getirir.
- `DELETE /v1/animal/{id}`: Belirtilen ID'ye sahip hayvanı siler.
- `PUT /v1/animal`: Belirtilen hayvanları günceller.
- `GET /v1/animal/customer/{name}`: Belirtilen müşteri adına göre bütün hayvanları getirir.
- `GET /v1/animal/all`: Bütün hayvanları getirir.

## Vaccine (Aşı) Tablosu

- `POST /v1/vaccine`: Yeni bir aşı ekler.
- `DELETE /v1/vaccine/{id}`: Belirtilen ID'ye sahip aşıyı siler.
- `GET /v1/vaccine/{vaccineName}/{animalName}`: Belirtilen aşı ve hayvan ismine göre filtreleme yapar.
- `GET /v1/vaccine/filter/{animalName}`: Belirtilen hayvan adına göre bütün aşıları getirir.
- `GET /v1/vaccine/date`: Belirtilen koruyuculuk tarihine göre aşıları filtreler.
- `GET /v1/vaccine/{name}`: Belirtilen aşı ismine göre filtreleme yapar.
- `PUT /v1/vaccine`: Belirtilen aşıyı günceller.
- `GET /v1/vaccine/all`: Bütün aşıları getirir.

## Doctor (Doktor) Tablosu

- `POST /v1/doctor`: Yeni bir doktor ekler.
- `GET /v1/doctor/{name}`: Belirtilen isme sahip doktoru ve müsait günlerini getirir.
- `DELETE /v1/doctor/{id}`: Belirtilen ID'ye sahip doktoru siler.
- `PUT /v1/doctor`: Belirtilen doktoru günceller.
- `GET /v1/doctor/all`: Bütün doktorları getirir.

## AvailableDate (Müsait Gün) Tablosu

- `POST /v1/available-date`: Yeni bir müsait tarih ekler.
- `GET /v1/available-date/{id}`: Belirtilen ID'ye sahip müsait tarihi getirir.
- `DELETE /v1/available-date/{id}`: Belirtilen ID'ye sahip müsait tarihi siler.
- `PUT /v1/available-date`: Belirtilen müsait tarihi günceller.
- `GET /v1/available-date/all`: Bütün müsait tarihleri getirir.

## Appointment (Randevu) Tablosu

- `POST /v1/appointment`: Yeni bir randevu ekler.
- `GET /v1/appointment/{id}`: Belirtilen ID'ye sahip randevuyu getirir.
- `DELETE /v1/appointment/{id}`: Belirtilen ID'ye sahip randevuyu siler.
- `GET /v1/appointment/filter`: Belirtilen hayvan adı ve tarih aralığına göre randevuları getirir.
- `GET /v1/appointment/filtered`: Belirtilen doktor adı ve tarih aralığına göre randevuları getirir.
- `PUT /v1/appointment`: Belirtilen randevuyu günceller.
- `GET /v1/appointment/all`: Bütün randevuları getirir.

## Report (Rapor) Tablosu

- `POST /v1/report`: Yeni bir rapor ekler.
- `GET /v1/report/{id}`: Belirtilen ID'ye sahip raporu getirir.
- `DELETE /v1/report/{id}`: Belirtilen ID'ye sahip raporu siler.
- `PUT /v1/report`: Belirtilen raporu günceller.
- `GET /v1/report/all`: Bütün raporları getirir.

## Genel Özellikler
* Sisteme önce bir müşteri eklenmelidir. Sonrasında hayvan , doktor , doktora ait müsait gün , randevu , rapor ve aşı eklenmelidir.
* Her randevuya ait tek bir rapor olabilir.
* Aynı isme sahip bir aşı eklemek için aşının koruma gününün geçmiş olması gerekmektedir.
* Doktora randevu ekleyebilmek için o gün müsait olmalı ve o saatte başka bir randevusu olmamalıdır.

## Teknolojiler
* Java 
* Spring Boot
* Maven
* MySQL
* REST API
* Swagger
* Postman
* IntelliJ IDEA
* Git
* GitHub


