package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import com.example.demo.collection.Lotto;

public interface LottoService {
	public List<Lotto> getLottoList() throws IOException;
}
