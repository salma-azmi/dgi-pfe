package com.example.back_dgi.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public  double ice;
    public String libelle;
}
