package com.lavinj87.toy_store.commands;

import com.lavinj87.toy_store.ToyStore;

public class Size extends Command
{
    @Override
    public Response execute(ToyStore store)
    {
        return new Response(String.valueOf(store.size()));
    }
}
