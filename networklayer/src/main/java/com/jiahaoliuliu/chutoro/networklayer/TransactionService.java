package com.jiahaoliuliu.chutoro.networklayer;

import com.jiahaoliuliu.chutoro.entity.Transaction;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface TransactionService {

    @GET("")
    Single<List<Transaction>> getItemsList();

}
