package ders5Ödev.core.concretes;

import ders5Ödev.core.abstracts.AuthorService;
import ders5Ödev.googleAuthenticator.GoogleAuthenticatorManager;

public class GoogleAuthenticatorManagerAdapter implements AuthorService {
    @Override
    public boolean isValidUser() {
        return new GoogleAuthenticatorManager().fromGoogleAuth();
    }
}
