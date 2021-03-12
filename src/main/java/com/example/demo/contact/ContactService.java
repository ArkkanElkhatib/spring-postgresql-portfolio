package com.example.demo.contact;

import com.example.demo.email.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository contactRepository;
    private final EmailSender emailSender;

    @Autowired
    public ContactService(ContactRepository contactRepository, EmailSender emailSender) {
        this.contactRepository = contactRepository;
        this.emailSender = emailSender;
    }

    public void addNewContact(Contact contact) {
        this.contactRepository.save(contact);
        emailSender.send("arkkan200@gmail.com", contact.toString());
    }

}
