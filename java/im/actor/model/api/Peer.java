package im.actor.model.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.Bser;
import im.actor.model.droidkit.bser.BserObject;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import static im.actor.model.droidkit.bser.Utils.*;
import java.io.IOException;
import im.actor.model.network.parser.*;
import java.util.List;
import java.util.ArrayList;

public class Peer extends BserObject {

    private PeerType type;
    private int id;

    public Peer(PeerType type, int id) {
        this.type = type;
        this.id = id;
    }

    public Peer() {

    }

    public PeerType getType() {
        return this.type;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.type = PeerType.parse(values.getInt(1));
        this.id = values.getInt(2);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        if (this.type == null) {
            throw new IOException();
        }
        writer.writeInt(1, this.type.getValue());
        writer.writeInt(2, this.id);
    }

    @Override
    public String toString() {
        String res = "struct Peer{";
        res += "type=" + this.type;
        res += ", id=" + this.id;
        res += "}";
        return res;
    }

}
