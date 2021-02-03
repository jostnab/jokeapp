package guru.springframework.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImp implements JokeService{
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImp() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJokeString() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
