package com.ivanferreira.junit.blog.armazenamento;

import com.ivanferreira.junit.blog.modelo.Post;

import java.util.List;
import java.util.Optional;

/*
 * Local onde são armazenados os posts
 */
public interface ArmazenamentoPost {
    Post salvar(Post post);
    Optional<Post> encontrarPorId(Long post);
    void remover(Long postId);
    List<Post> encontrarTodos();
}
