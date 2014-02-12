package com.tectual.herherkerker.web.data;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.query.Select;
import com.tectual.herherkerker.models.Joke;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by arash on 27/01/2014.
 */
public class JsonJokes extends ArrayList<JsonJoke> {

    public List<Joke> persist(){
        List<Joke> jokes = new ArrayList<Joke>();

        ActiveAndroid.beginTransaction();
        try{
            for (JsonJoke element : this) {
                Joke joke = element.toModel();
                joke.save();
                jokes.add(joke);
            }
            ActiveAndroid.setTransactionSuccessful();
        }
        finally {
            ActiveAndroid.endTransaction();
        }

        return jokes;
    }
}