package com.blog.blog_esportivo.model;

import java.util.List;

public class Postagem {
    private Long id;

    private String titulo;
    private String conteudo;

    private Usuario usuario;
    private Categoria categoria;

    private List<Comentario> comentarios;
    private List<Curtida> curtidas;

     // getters e setters


}
