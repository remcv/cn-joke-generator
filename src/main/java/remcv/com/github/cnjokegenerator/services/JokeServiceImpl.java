package remcv.com.github.cnjokegenerator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService
{
    // fields
    private final ChuckNorrisQuotes cnq;

    // constructor
    @Autowired
    public JokeServiceImpl(ChuckNorrisQuotes cnq)
    {
        this.cnq = cnq;
    }

    // methods
    @Override
    public String getJoke() 
    {
        return cnq.getRandomQuote();
    }
}
