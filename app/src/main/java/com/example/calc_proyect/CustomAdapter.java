package com.example.calc_proyect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<String> operaciones;
    List<String> resultados;

    public CustomAdapter(Context context, List<String> signatures, List<String> resultados) {
        super();
        this.context = context;
        this.operaciones = signatures;
        this.resultados = resultados;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView operacionText;
        TextView resultadoText;

        String operacion = operaciones.get(position);
        String resultado = resultados.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.recyclerview_historial, null);

            operacionText = convertView.findViewById(R.id.operacionText);
            resultadoText = convertView.findViewById(R.id.resultadoText);

            operacionText.setText(operacion);
            resultadoText.setText(resultado);
        }

        return convertView;
    }
}
