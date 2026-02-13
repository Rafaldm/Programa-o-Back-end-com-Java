package model;

import java.io.*;
import java.util.ArrayList;

public class PessoaJuridicaRepo {

    private ArrayList<PessoaJuridica> lista = new ArrayList<>();

    public void inserir(PessoaJuridica pj) {
        lista.add(pj);
    }

    public void alterar(PessoaJuridica pj) {
        PessoaJuridica existente = obter(pj.getId());
        if (existente != null) {
            lista.remove(existente);
            lista.add(pj);
        }
    }

    public void excluir(int id) {
        PessoaJuridica pj = obter(id);
        if (pj != null) {
            lista.remove(pj);
        }
    }

    public PessoaJuridica obter(int id) {
        for (PessoaJuridica pj : lista) {
            if (pj.getId() == id) {
                return pj;
            }
        }
        return null;
    }

    public ArrayList<PessoaJuridica> obterTodos() {
        return lista;
    }

    public void persistir(String nomeArquivo) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArquivo));
        out.writeObject(lista);
        out.close();
    }

    public void recuperar(String nomeArquivo) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeArquivo));
        lista = (ArrayList<PessoaJuridica>) in.readObject();
        in.close();
    }
}
