package com.example.demo.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.example.demo.collection.Lotto;
import com.example.demo.service.LottoService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LottoServiceImpl implements LottoService {
	private String targetUrl = "http://lottowa.net/analysis/case1.htm";

	@Override
	public List<Lotto> getLottoList() throws IOException {
		Document doc = Jsoup.connect(targetUrl).get(); // 브라우저 다큐먼트 역활을 다큐먼트로 지정, 커넥트 = 쿼리셀렉터 올, 커넥트퍼스트, 쿼리셀렉터
		Elements trEles = doc.select("div.cont_section table.tbl_s4 tbody>tr");
		for (Element tr : trEles) {
			Integer rotation = Integer.parseInt(tr.child(0).text());
			log.info("rotation=>{}", rotation);
			
			String winDate = tr.child(1).text();
			log.info("winDate=>{}", winDate);
			
			List<String> lottoNums = new ArrayList<String>();
			lottoNums.add(tr.select("ul>li").text());
			log.info("lottoNums=>{}", lottoNums);
			
			Elements liEles = tr.select("ul>li");
			log.info("liEles=>{}", liEles);
			
		}
		// TODO Auto-generated method stub
		return null;
	}

}
