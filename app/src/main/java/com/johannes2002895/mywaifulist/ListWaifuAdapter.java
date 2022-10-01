package com.johannes2002895.mywaifulist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;




public class ListWaifuAdapter  extends RecyclerView.Adapter<ListWaifuAdapter.ListViewHolder>{
    private ArrayList<Waifu> listWaifu;
    //Onclick
    private OnItemClickCallback onItemClickCallback;
    //Onclick Method
    public void setOnItemClickCallback(OnItemClickCallback
                                               onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public ListWaifuAdapter(ArrayList<Waifu> list) {
        this.listWaifu = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,
                                             int viewType) {
        View view =
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_waifu,
                        viewGroup, false);
        return new ListViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int
            position) {
        Waifu Waifu = listWaifu.get(position);
        Glide.with(holder.itemView.getContext())
                .load(Waifu.getPhotoThumbnail())
                .apply(new RequestOptions().override(65, 55))

                .into(holder.imgPhoto);
        holder.tvName.setText(Waifu.getName());
        holder.tvDetail.setText(Waifu.getDetail());
//Onclick
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listWaifu.get(holder.getAdapterPosition()));
            }
        });
    }
    @Override
    public int getItemCount() {
        return listWaifu.size();
    }
    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
    //Onclick Interface
    public interface OnItemClickCallback {
        void onItemClicked(Waifu data);
    }
}
