package ders5Ödev.core.concretes;

import ders5Ödev.core.abstracts.EmailService;

public class EmailManager implements EmailService {
    @Override
    public void sendVerificationEmail(String email) {
        System.out.println("Doğrulama Maili "+email+" gönderildi. Sürecin tamamlanması için maildeki linke tıklayınız");
    }
}
