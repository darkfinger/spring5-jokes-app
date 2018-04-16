package guru.springframework.joke.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class ChuckQuoteServiceImpl implements ChuckQuoteService {

    @Override
    public String printAQuote() {
        ChuckNorrisQuotes chuckNorrisQuotes=new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }
}
