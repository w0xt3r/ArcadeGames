package com.agames.arcadegames.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.agames.arcadegames.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by gerard on 1/07/17.
 */

public class GamesList extends BaseAdapter {

    private Context context;
    private int layoutResourceId;
    private ArrayList<String> games;

    /**
     * Constructor of GamesList
     *
     * @param   games   list of games
     */
    public GamesList(Context context, int layoutResourceId, ArrayList<String> games) {
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.games = games;
    }

    @Override
    public int getCount() {
        return this.games.size();
    }

    @Override
    public Object getItem(int i) {
        return this.games.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if(view == null) {
            LayoutInflater inflater = ((Activity) this.context).getLayoutInflater();

            view = inflater.inflate(layoutResourceId, viewGroup, false);

            holder = new ViewHolder(view);

            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }

        String aux = this.games.get(i);

        holder.name.setText(aux);

        switch (aux) {
            case "Space Invaders":
                holder.logo.setImageDrawable(context.getResources().getDrawable( R.drawable.space_invaders_invader));
                break;
            case "Pacman":
                holder.logo.setImageDrawable(context.getResources().getDrawable( R.drawable.pacman));
                break;

        }

        return view;
    }

    static class ViewHolder {

        @BindView(R.id.tv_name) TextView name;
        @BindView(R.id.iv_logo) ImageView logo;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }

    }

}
