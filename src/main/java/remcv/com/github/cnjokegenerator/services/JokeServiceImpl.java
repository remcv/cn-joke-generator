package remcv.com.github.cnjokegenerator.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService
{
    // fields
    private final ChuckNorrisQuotes cnq;

    // constructor
    public JokeServiceImpl()
    {
        cnq = new ChuckNorrisQuotes();
    }

    // methods
    @Override
    public String getJoke() 
    {
        return cnq.getRandomQuote();
    }
}
